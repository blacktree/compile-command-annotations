/*
 * ====================================================================
 * Hotspot compile command annotations
 * ====================================================================
 * Copyright (C) 2014 Julien Nicoulaud <julien.nicoulaud@gmail.com>
 * ====================================================================
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * ====================================================================
 */
package net.nicoulaj.compilecommand;

import net.nicoulaj.compilecommand.annotations.Log;
import net.nicoulaj.compilecommand.annotations.Print;
import net.nicoulaj.compilecommand.annotations.Quiet;

@Quiet // Do not print the compile commands on application startup.
public class Sample_03_Logging {

    // This sample demonstrates the different logging options.
    //
    // To run:
    //   $ mvn clean test
    //   $ java -cp target/test-classes \
    //          -XX:+UnlockDiagnosticVMOptions \
    //          -XX:+PrintCompilation \
    //          -XX:+LogCompilation \
    //          -XX:+PrintInlining \
    //          -XX:CompileCommandFile=src/samples/resources/net/nicoulaj/compilecommand/Sample_03_Logging \
    //          net.nicoulaj.compilecommand.Sample_03_Logging

    public static void main(String... args) {
        for (int i = 0; i < 100000; i++) {
            method01();
            method02();
        }
    }

    @Print // Print generated assembler code after compilation of the specified method.
    private static void method01() {
    }

    @Log // Exclude compilation logging for all methods except for the specified method.
    private static void method02() {
    }
}
