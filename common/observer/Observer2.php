<?php

namespace common\observer;


class Observer2 implements Observer
{
    public function update()
    {
        echo __CLASS__ . ' update ()';
    }

}