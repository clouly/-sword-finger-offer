package ArraysAndStrings;

class Store {
    int key = -1;
    int value = -1;

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

}

public class Foo {

    private final static ThreadLocal<Store> threadLocal = new ThreadLocal<Store>();

    // 通常使用@synchronized注解
    public int foo(Store s, int key, int value) {

        if (s.getKey() != key || s.getValue() != key) {
            s.setKey(key);
            s.setValue(value);
            return 0;
        } else {
            if (key == value) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    Store getStore() {
        Store store = threadLocal.get();
        // 线程首次执行此方法的时候，threadLocal.get()肯定为null
        if (store == null) {
            // 创建一个对象，并保存到本地线程变量threadLocal中
            store = new Store();
            threadLocal.set(store);
        }
        return store;
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        Store store = f.getStore();
        System.out.println("foo(store,0,1)="+f.foo(store, 0, 1));// 0
        System.out.println("foo(store,1,1)="+f.foo(store, 1, 1));// 0
        System.out.println("foo(store,1,1)="+f.foo(store, 1, 1));// 1
        System.out.println("foo(store,2,1)="+f.foo(store, 1, 2));// 2
        System.out.println("foo(store,1,1)="+f.foo(store, 1, 1));// 1
    }

}
