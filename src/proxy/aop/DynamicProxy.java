package proxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        // 寻找JoinPoint连接点，APO框架使用元数据定义
        if (true) {
            // 执行给一个前置通知
            (new BeforeAdvice()).exec();
        }

        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}