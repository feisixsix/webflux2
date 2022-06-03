package fei.demo.webflux2.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author LaiXiaoHui
 * @Date 2022/5/21 15:01
 * @Description
 * @Since version-1.0
 */
public class TestReactor {
    public static void main(String[] args) {
        //just直接声明
        Flux.just(1,2,3,4).subscribe(System.out::println);
        Mono.just(1).subscribe(System.out::println);
        //其他方法
        Integer[] arr = {1,2,3,4};
        Flux.fromArray(arr);//数组
        List<Integer> list = Arrays.asList(arr);
        Flux.fromIterable(list);//集合
        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);//流
    }
}
