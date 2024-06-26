// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VectorTest {
  @Test
  void testVectorPlus() {
    var vec1 = VecBuilder.fill(1.0, 2.0, 3.0);
    var vec2 = VecBuilder.fill(4.0, 5.0, 6.0);
    var result1 = vec1.plus(vec2);

    assertEquals(5.0, result1.get(0, 0));
    assertEquals(7.0, result1.get(1, 0));
    assertEquals(9.0, result1.get(2, 0));

    var vec3 = VecBuilder.fill(-1.0, 2.0, -3.0);
    var vec4 = VecBuilder.fill(4.0, -5.0, 6.0);
    var result2 = vec3.plus(vec4);

    assertEquals(3.0, result2.get(0, 0));
    assertEquals(-3.0, result2.get(1, 0));
    assertEquals(3.0, result2.get(2, 0));
  }

  @Test
  void testVectorMinus() {
    var vec1 = VecBuilder.fill(1.0, 2.0, 3.0);
    var vec2 = VecBuilder.fill(4.0, 5.0, 6.0);
    var result1 = vec1.minus(vec2);

    assertEquals(-3.0, result1.get(0, 0));
    assertEquals(-3.0, result1.get(1, 0));
    assertEquals(-3.0, result1.get(2, 0));

    var vec3 = VecBuilder.fill(-1.0, 2.0, -3.0);
    var vec4 = VecBuilder.fill(4.0, -5.0, 6.0);
    var result2 = vec3.minus(vec4);

    assertEquals(-5.0, result2.get(0, 0));
    assertEquals(7.0, result2.get(1, 0));
    assertEquals(-9.0, result2.get(2, 0));
  }

  @Test
  void testVectorDot() {
    var vec1 = VecBuilder.fill(1.0, 2.0, 3.0);
    var vec2 = VecBuilder.fill(4.0, 5.0, 6.0);

    assertEquals(32.0, vec1.dot(vec2));

    var vec3 = VecBuilder.fill(-1.0, 2.0, -3.0);
    var vec4 = VecBuilder.fill(4.0, -5.0, 6.0);

    assertEquals(-32.0, vec3.dot(vec4));
  }

  @Test
  void testVectorNorm() {
    assertEquals(Math.sqrt(14.0), VecBuilder.fill(1.0, 2.0, 3.0).norm());
    assertEquals(Math.sqrt(14.0), VecBuilder.fill(1.0, -2.0, 3.0).norm());
  }
}
