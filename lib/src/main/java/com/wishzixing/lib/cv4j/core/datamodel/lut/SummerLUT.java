/*
 * Copyright (c) 2017-present, CV4J Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wishzixing.lib.cv4j.core.datamodel.lut;

/**
 * The filter which is consists of colors that are shades of green and yellow.
 * <p>
 * For more information please see:
 * <a target="_blank" href="http://baike.baidu.com/link?url=kysXstK853g0mEbTgPIdkrqO5qTTbgfW-B0O1FJP4MYYzp
 * G5_6E_LlaP_6T9XTn2c97Ge6hJUojJzkppCdnO-mJxIee_XsNASTsy82RaQZe">About ColorMap</a> <p>
 * Or see:
 * <a target="_blank" href="http://matlab.izmiran.ru/help/techdoc/ref/colormap.html">MATLAB Function Reference - colormap</a>
 *
 */
public class SummerLUT {

    public static int[][] SUMMER_LUT = new int[][]{
            {0, 129, 101}, {0, 129, 101}, {1, 128, 101}, {2, 129, 102}, {3, 130, 103},
            {3, 130, 103}, {6, 130, 102}, {7, 131, 103}, {8, 131, 102}, {9, 132, 103},
            {11, 132, 101}, {12, 133, 102}, {12, 133, 100}, {13, 134, 101}, {14, 133, 101},
            {15, 134, 102}, {16, 136, 101}, {17, 137, 102}, {17, 137, 102}, {18, 138, 103},
            {19, 137, 102}, {20, 138, 103}, {22, 138, 101}, {23, 139, 102}, {24, 138, 102},
            {25, 139, 103}, {26, 141, 102}, {26, 141, 102}, {29, 141, 101}, {30, 142, 102},
            {30, 142, 102}, {30, 142, 102}, {32, 143, 101}, {32, 143, 101}, {33, 144, 102},
            {34, 145, 103}, {36, 145, 103}, {36, 145, 103}, {37, 147, 102}, {38, 148, 103},
            {40, 147, 101}, {41, 148, 102}, {42, 148, 100}, {43, 149, 101}, {43, 149, 101},
            {44, 150, 102}, {44, 150, 102}, {45, 151, 102}, {48, 152, 103}, {49, 153, 102},
            {50, 152, 102}, {51, 153, 103}, {53, 153, 103}, {54, 154, 104}, {55, 153, 102},
            {56, 154, 103}, {55, 155, 101}, {56, 156, 102}, {58, 157, 102}, {58, 157, 102},
            {60, 158, 101}, {61, 159, 102}, {63, 158, 102}, {63, 158, 102}, {64, 159, 101},
            {65, 160, 102}, {66, 159, 102}, {67, 160, 103}, {67, 161, 101}, {68, 162, 102},
            {71, 162, 101}, {72, 163, 102}, {72, 163, 102}, {73, 164, 103}, {74, 164, 102},
            {75, 165, 103}, {75, 165, 101}, {76, 166, 102}, {77, 166, 102}, {78, 167, 103},
            {81, 167, 102}, {81, 167, 102}, {82, 169, 101}, {83, 170, 102}, {85, 170, 102},
            {85, 170, 102}, {85, 171, 100}, {86, 172, 101}, {88, 171, 103}, {89, 172, 104},
            {91, 172, 103}, {91, 172, 103}, {92, 174, 102}, {93, 175, 103}, {94, 176, 102},
            {94, 176, 102}, {95, 176, 100}, {96, 177, 101}, {99, 177, 102}, {99, 177, 102},
            {100, 176, 101}, {101, 177, 102}, {104, 178, 103}, {104, 178, 103}, {103, 180, 102},
            {104, 181, 103}, {106, 180, 101}, {107, 181, 102}, {108, 181, 100}, {109, 182, 101},
            {110, 181, 101}, {111, 182, 102}, {112, 184, 102}, {112, 184, 102}, {115, 184, 103},
            {116, 185, 104}, {117, 186, 103}, {117, 186, 103}, {118, 186, 101}, {119, 187, 102},
            {119, 187, 100}, {120, 188, 101}, {122, 188, 100}, {123, 189, 101}, {124, 190, 102},
            {125, 191, 103}, {126, 190, 103}, {127, 191, 104}, {128, 191, 102}, {129, 192, 103},
            {130, 193, 102}, {130, 193, 102}, {132, 193, 100}, {133, 194, 101}, {134, 195, 100},
            {134, 195, 100}, {136, 195, 103}, {137, 196, 104}, {139, 196, 102}, {140, 197, 103},
            {140, 197, 102}, {141, 198, 103}, {141, 198, 101}, {142, 199, 102}, {143, 199, 100},
            {144, 200, 101}, {146, 200, 102}, {147, 201, 103}, {149, 201, 101}, {150, 202, 102},
            {151, 201, 102}, {152, 202, 103}, {152, 204, 103}, {152, 204, 103}, {153, 204, 101},
            {154, 205, 102}, {157, 206, 101}, {157, 206, 101}, {159, 206, 102}, {160, 207, 103},
            {160, 207, 101}, {161, 208, 102}, {163, 208, 103}, {163, 208, 103}, {163, 209, 101},
            {164, 210, 102}, {167, 210, 102}, {167, 210, 102}, {168, 212, 101}, {169, 213, 102},
            {170, 212, 100}, {171, 213, 101}, {171, 213, 101}, {172, 214, 102}, {174, 214, 102},
            {175, 215, 103}, {176, 214, 101}, {177, 215, 102}, {178, 217, 102}, {179, 218, 103},
            {180, 217, 101}, {181, 218, 102}, {181, 219, 100}, {182, 220, 101}, {185, 220, 104},
            {185, 220, 104}, {186, 219, 102}, {187, 220, 103}, {188, 222, 102}, {188, 222, 102},
            {189, 223, 102}, {190, 224, 103}, {192, 224, 101}, {193, 225, 102}, {194, 224, 102},
            {195, 225, 103}, {195, 225, 101}, {196, 226, 102}, {197, 225, 102}, {198, 226, 103},
            {201, 227, 102}, {202, 228, 103}, {202, 228, 101}, {203, 229, 102}, {204, 229, 101},
            {205, 230, 102}, {205, 230, 102}, {206, 231, 103}, {208, 231, 101}, {209, 232, 102},
            {211, 232, 103}, {211, 232, 103}, {212, 233, 102}, {213, 234, 103}, {215, 235, 102},
            {215, 235, 102}, {216, 236, 102}, {216, 236, 102}, {218, 236, 100}, {219, 237, 101},
            {220, 238, 102}, {220, 238, 102}, {222, 238, 103}, {223, 239, 104}, {225, 239, 102},
            {226, 240, 103}, {226, 240, 101}, {227, 241, 102}, {228, 241, 101}, {229, 242, 102},
            {229, 242, 100}, {230, 243, 101}, {232, 243, 104}, {233, 244, 105}, {235, 244, 103},
            {236, 245, 104}, {237, 244, 102}, {238, 245, 103}, {238, 246, 101}, {239, 247, 102},
            {239, 247, 100}, {240, 248, 101}, {241, 249, 102}, {241, 249, 102}, {244, 250, 102},
            {245, 251, 103}, {247, 251, 104}, {247, 251, 104}, {248, 251, 102}, {249, 252, 103},
            {249, 252, 101}, {250, 253, 102}, {252, 253, 100}, {253, 254, 101}, {254, 255, 102},
            {255, 255, 103}
    };

}
