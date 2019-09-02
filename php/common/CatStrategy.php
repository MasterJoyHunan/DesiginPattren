<?php

namespace common;


class CatStrategy implements Strategy
{
    public function eat()
    {
        echo 'eat fish';
    }

    public function shout()
    {
        echo 'mao mao mao';
    }

}