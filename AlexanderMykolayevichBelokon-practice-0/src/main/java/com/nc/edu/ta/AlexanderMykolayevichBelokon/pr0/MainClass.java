/**
 * Alexander Belokon & educators
 * <p>
 * Copyright (c) 2021 Netcracker Educational Center
 * <p>
 * This software is an educational exercise and is to be used by educators
 * in education center Netcracker for use by students of the automatic QA course
 * and is used as a student's practical work.
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr0;

import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr0.operations.Operation;

/**
 * Class MainClass calculates and outputs to the console the matrix obtained
 * from the result of a mathematical operation on two input operands of the
 * range of numbers 1...10, given by a loop and passed to the Operation class
 * instance as an argument with returning the result to the MainClass .
 *
 * @version 1.1 03 Feb 2021
 * @author Alexander Belokon & educators
 */
public class MainClass {
    /**
     * function main create two cycles using two numbers.
     *   x first cycle increment parameter
     *   y second cycle increment parameter
     */
            public static void main(String[] args) {
                    for (int x = 1; x < 10; x++) {
                            for (int y = 1; y < 10; y++) {
                                    /** Operation return to main arithmetic
                                    result using x,y operation parameter
                                    */
                                    Operation operation = new Operation(x, y);
                                    System.out.printf("%3d", operation.getResult());
                            }
                    System.out.println();
            }
     }
}
