/**
 * Alexander Belokon
 * <p>
 * Copyright (c) 2021 Netcracker Educational Center
 * <p>
 * This software is an educational exercise and is to be used by educators
 * in education center Netcracker for use by students of the automatic QA course
 * and is used as a student's practical work.
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr0.operations;

public class Operation {
        /**
         * Create new operation using two numbers.
         *
         *  Operation method
         * @param x first operand
         * @param y second operand
         */
        public Operation(int x, int y) {
                this.x = x;
                this.y = y;
        }

        /**
        * @return result of operation
        */
        public int getResult() {
            return x * y;
        }

        private int x;
        private int y;
}
