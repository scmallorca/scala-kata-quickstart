package com.scmallorca

import org.scalatest.{Matchers, WordSpec}

final class KataSpec extends WordSpec with Matchers {
  "Kata" should {
    "return 0 when enter value is 1" in {
      Kata.getResult(1) shouldBe "0"
    }
  }
}
