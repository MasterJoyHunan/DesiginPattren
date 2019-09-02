<?php

namespace common\decorator;

/**
 * 装饰器模式
 * Interface MakeHtmlDecorator
 * @package common\decorator
 */
interface MakeHtmlDecorator
{
    public function makeBefore();
    public function makeAfter();
}