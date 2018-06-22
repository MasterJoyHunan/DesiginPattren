<?php

namespace common;

/**
 * 策略模式, 根据不同的条件, 生成不同的策略
 * 策略模式一般都是接口
 * 可以实现依赖倒置 控制反转 IOC
 * Class Strategy
 * @package common
 */
interface Strategy
{
    public function eat();
    public function shout();
}