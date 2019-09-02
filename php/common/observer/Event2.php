<?php
namespace common\observer;
use common\Config;
/**
 * 观察者模式, 当一个对象状态发生改变,会通知其他依赖对象, 并自动更新
 * [抽象--事件发生者 基类]
 * Class Event
 * @package common
 */
abstract class Event2
{
    protected $observer = [];
    public function __construct()
    {
        $config = new Config();
        $model = $config->get('Model');
        foreach ($model as $v){
            $this->observer[] = new $v;
        }
    }

    public function notify()
    {
        foreach ($this->observer as $observer) {
            $observer->update();
        }
    }
}