package com.midgetontoes.reactorexamples;

import reactor.core.publisher.Flux;

public class FluxCreator {
    public static void main(String[] args) {
        Flux.just("Hello").subscribe(System.out::println);
    }
}
