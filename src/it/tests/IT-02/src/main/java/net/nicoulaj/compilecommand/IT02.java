/*
 * Copyright 2014 Julien Nicoulaud <julien.nicoulaud@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.nicoulaj.compilecommand;

import net.nicoulaj.compilecommand.annotations.DontInline;

import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

public class IT02 {

    public static void main(String... args) {
        for (int i = 0; i < 100000; i++) {
            final IT02 it = new IT02();
            it.method01();
            it.method02(true);
            it.method03();
            it.method04(asList("test"));
            it.method05(asList("test"));
            it.method06(new Double[]{});
            it.method07(asList("test"));
            it.method08("test");
            it.method09(true, (short) 0, (int) 0, (long) 0, (float) 0, (double) 0, (char) 0, (byte) 0);
            it.method10(true, (short) 0, (int) 0, (long) 0, (float) 0, (double) 0, (char) 0, (byte) 0);
        }
    }

    @DontInline
    public IT02() {
    }

    @DontInline
    private void method01() {
    }

    @DontInline
    private void method02(boolean arg1) {
    }

    @DontInline
    private static void method03() {
    }

    @DontInline
    private void method04(List<String> arg1) {
    }

    @DontInline
    private double method05(List<String> arg1) {
        return 0;
    }

    @DontInline
    private <T extends Serializable> void method06(T[] arg1) {
    }

    @DontInline
    private <T extends Serializable> void method07(List<? extends T> arg1) {
    }

    @DontInline
    private <T extends Serializable> T method08(T arg1) {
        return arg1;
    }

    @DontInline
    private void method09(boolean arg1,
                          short arg2,
                          int arg3,
                          long arg4,
                          float arg5,
                          double arg6,
                          char arg7,
                          byte arg8) {
    }

    @DontInline
    private void method10(Boolean arg1,
                          Short arg2,
                          Integer arg3,
                          Long arg4,
                          Float arg5,
                          Double arg6,
                          Character arg7,
                          Byte arg8) {
    }
}