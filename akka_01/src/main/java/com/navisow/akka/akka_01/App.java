package com.navisow.akka.akka_01;

import com.navisow.akka.akka_01.controllers.Controller;
import com.navisow.akka.akka_01.controllers.Hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Controller controller = new Hello();
        controller.Execute();
    }
}
