package view;

import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.stage.Stage;

public abstract class UIObject extends Stage {
    protected Parent root;
    private double xOffset;
    private double yOffset;

    /**
     * 返回绑定ui组件
     * @param id
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T $(String id, Class<T> clazz){
        return (T) root.lookup("#" + id);
    }

    /**
     * 鼠标拖动事件
     */
    public void move(){
        root.setOnMousePressed(event -> {
            xOffset = getX() - event.getScreenX();
            yOffset = getY() - event.getScreenY();
            root.setCursor(Cursor.HAND);
        });
        root.setOnMouseDragged(event -> {
            setX(xOffset + event.getScreenX());
            setY(yOffset + event.getScreenY());
        });
        root.setOnMouseReleased(event -> {
            root.setCursor(Cursor.DEFAULT);
        });
    }

    /**
     * 返回窗口x轴大小
     * @return
     */
    public double x(){
        return getX();
    }

    /**
     * 获取窗口y轴大小
     * @return
     */
    public double y(){
        return getY();
    }

    /**
     * 返回窗口宽度
     * @return
     */
    public double width(){
        return getWidth();
    }

    /**
     * 返回窗口高度
     * @return
     */
    public double height(){
        return getHeight();
    }

    // 初始化页面
    public abstract void initView();
    // 初始化事件定义
    public abstract void initEventDefine();

}


