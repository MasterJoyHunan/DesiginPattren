<?php

namespace common\decorator;


class Generate2 implements MakeHtmlDecorator
{

    public function makeBefore()
    {
        echo __CLASS__ . 'makeBefore() <br />';
    }

    public function makeAfter()
    {
        echo __CLASS__ . 'makeAfter() <br />';
    }

}