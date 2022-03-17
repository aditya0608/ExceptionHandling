package com.aditya.controller;

import com.aditya.common.BusinessException;

/*
You can use a try without catch by writing the tasks for catch in the finally block
Throw is used for custom exceptions mostly
Throws is used for already addressed exceptions and needs to be thrown by
methods calling the methods where the exception is thrown
 */
public class Controller {

    private String userId;
    public Controller(String userId)   {
        try {
            int y=1/0;
            if (userId.equalsIgnoreCase("ADITYA")) {
                System.out.println("SUCCESS ");
            } else {
                throw new BusinessException("ID Not VALId", userId);
                //only one exception can be caught at one time
            }
        }
        //Cannot put statements between catch /try /finally
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception occured ");
        }
        catch (BusinessException e)
        {
            System.out.println("BusinessException exception occured");
        }
        /*Exception should be caught in last and custom exceptions at top
        as it will always be caught and other catch blocks will become unreachable code
         */

        catch(Exception e)
        {
            System.out.println("Generic exception...");
        }
        finally{
            System.out.println("AFTER EXCEPTION ......");

        }

    }
}
