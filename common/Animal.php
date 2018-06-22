<?php

namespace common;

/**
 * 策略模式实现类
 * Class Animal
 * @package common
 */
class Animal
{
    /**
     * @var \common\Strategy
     */
    protected $strategy;

    public function setStrategy(\common\Strategy $strategy)
    {
        $this->strategy = $strategy;
    }

    public function index()
    {
        $this->strategy->eat();
        echo '<hr>';
        $this->strategy->shout();
    }
}