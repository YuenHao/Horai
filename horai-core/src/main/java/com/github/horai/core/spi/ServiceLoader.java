package com.github.horai.core.spi;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by yWX377796 on 2016/12/5.
 * 类加载器，配合SPI使用，主要用于反射。
 */
public class ServiceLoader {

    private static final String HORAI_DIRECTORY = "META-INF/horai/";

    /**
     * 利用反射原理,返回clazz的子类的实现
     * @param clazz 接口,必须被SPI注解
     * @param name 子类名
     * @param <T> 返回类型
     * @return 实现接口的子类
     */
    public static <T> T load(Class<T> clazz, String name) {

        // 获取参数名及默认值

        // 获取所有实现类

        // 根据参数名判断是哪个实现

        // 返回实现

        return null;
    }

    /**
     * 根据接口获取所有的实现
     * @param clazz 接口
     * @return 实现
     */
    private static ServiceProvider getServiceProviders(final Class<?> clazz) {

        if (clazz == null) {

        }

        if (!clazz.isInterface()) {

        }

        if (!clazz.isAnnotationPresent(SPI.class)) {

        }

        SPI spi = clazz.getAnnotation(SPI.class);

        final Set<URLDefinition> urlDefinitions = new HashSet<URLDefinition>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        urlDefinitions.addAll(collectExtensionUrls(HORAI_DIRECTORY + clazz.getName(), classLoader));
        // TODO: 2016/12/7 添加逻辑
        return null;
    }

    /**
     * 获取实现该接口的类
     * @param resourceName
     * @param classLoader
     * @return
     */
    private static Set<URLDefinition> collectExtensionUrls(String resourceName, ClassLoader classLoader) {
        final Enumeration<URL> urlEnumeration;
        if (classLoader != null) {
            try {
                urlEnumeration = classLoader.getResources(resourceName);
            } catch (IOException e) {

                // TODO: 2016/12/6  添加处理逻辑
                return null;
//                throw new IOException(e);
            }
        } else {
            try {
                urlEnumeration = ClassLoader.getSystemResources(resourceName);
            } catch (IOException e) {
                // TODO: 2016/12/6 添加处理逻辑
                return null;
//                throw new IOException(e);
            }
        }
        Set<URLDefinition> urlDefinitions = new HashSet<URLDefinition>();
        while (urlEnumeration.hasMoreElements()) {
            URL url = urlEnumeration.nextElement();
            // TODO: 2016/12/7 具体的操作逻辑


        }

        return null;
    }

    /**
     * 具体实现类的地址及classloader
     * 用于资源的定向,重写了euqals和hashCode方法
     */
    private static class URLDefinition {
        private final URL url;
        private final ClassLoader classLoader;

        private URLDefinition(URL url, ClassLoader classLoader) {
            this.url = url;
            this.classLoader = classLoader;
        }

    }

    /**
     * 实现类的名称，类型，classloader
     */
    private static final class ServiceDefinition {

        private final String name;
        private final String clazz;
        private final ClassLoader classLoader;

        private ServiceDefinition(String name, String clazz, ClassLoader classLoader) {
            this.name = name;
            this.clazz = clazz;
            this.classLoader = classLoader;
        }
    }

    /**
     * 定义Service提供类，包括默认类型及系统能提供的所有类型
     */
    private static final class ServiceProvider {
        private final Class<?> clazz;
        private final String defaultName;
        private final String dynamicConfigKey;
        private final ConcurrentMap<String, ServiceDefinition> nameMaps;

        public ServiceProvider(Class<?> clazz, String dynamicConfigKey, String defaultName, ConcurrentMap<String, ServiceDefinition> nameMaps) {
            this.clazz = clazz;
            this.dynamicConfigKey = dynamicConfigKey;
            this.defaultName = defaultName;
            this.nameMaps = nameMaps;
        }
    }

}
