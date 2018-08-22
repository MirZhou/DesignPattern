package factory3;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    public static final Map<String, Product> productMap = new HashMap<>();

    public static synchronized Product createProduct(String type) {
        Product product = null;

        if (productMap.containsKey(type)) {
            product = productMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }

            // 把对象放到缓存容器中
            productMap.put(type, product);
        }

        return product;
    }
}
