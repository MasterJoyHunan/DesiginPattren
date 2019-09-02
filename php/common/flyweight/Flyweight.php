<?php
namespace common\flyweight;
/**
 * 享元模式 为减少内存开销,将不需要重复new的对象共享,(类似于单例模式)
 * Interface Flyweight
 * @package common\flyweight
 */
interface Flyweight
{
    public function operation();
}