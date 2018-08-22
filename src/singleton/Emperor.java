package singleton;

/**
 * 皇帝
 */
public class Emperor {
    private static final Emperor emperor = new Emperor(); // 初始化一个对象

    // 隐藏构造函数
    private Emperor() {

    }


    public static Emperor getInstance() {
        return emperor;
    }


    public void say() {
        System.out.println("皇帝发话了");
    }
}