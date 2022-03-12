/**
 * Alexander Belokon
 * <p>
 * Copyright (c) 2021 Netcracker Educational Center
 * <p>
 * This software is an educational exercise and is to be used by educators
 * in education center Netcracker for use by students of the automatic QA cource
 * and is used as a student's practical work.
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr0.operations;

import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr0.operations.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class OperationTest test work the class Operation by comparing the results of the
 * test suite created by nested loops, with incremental variables in them ,with the
 * results of the call Operation(a, b).getResult()
 *
 * @version 1.1 03 Feb 2021
 * @author Alexander Belokon & educators
 */
public class OperationTest {
        @Test
        public void testMultiply() {
                for (int a = 0; a < 100; a++) {
                        for (int b = 0; b < 100; b++) {
                                /**  Assertions.assertEquals tests if first argumet equal to result of work
                                 * second argument in eacs loop incremention and show how test passed.
                                 * @param a first operand
                                 * @param b second operand
                                 */
                                 Assertions.assertEquals(a * b, new Operation(a, b).getResult());
                        }
                }
        }
}