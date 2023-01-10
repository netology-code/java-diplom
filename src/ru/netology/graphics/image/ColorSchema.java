/*
 * File:     ColorSchema
 * Package:  ru.netology.graphics.image
 * Project:  java-diplom
 *
 * Created by dromakin as 05.01.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.01.10
 */

package ru.netology.graphics.image;


public class ColorSchema implements TextColorSchema {
    /**
     * @param color 0 - 255
     * @return character to print number of color
     */
    @Override
    public char convert(int color) {
        return color <= 28 ? '▇' : color <= 56 ? '●' : color <= 84 ? '◉' : color <= 112 ? '◍' : color <= 140 ? '◎' : color <= 168 ? '○' : color <= 196 ? '☉' : color <= 224 ? '◌' : color <= 255 ? '-' : ' ';
    }
}
