<?php
namespace common\observer;

/**
 * 观察者模式, 当一个对象状态发生改变,会通知其他依赖对象, 并自动更新
 * [接口--观察者 基类]
 * Class Observer
 * @package common
 */
interface Observer
{
    /**
     * 事件发生后执行
     * @return mixed
     */
    public function update();
}