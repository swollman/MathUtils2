import pytest
from MathUtils import MathUtils

@pytest.fixture
def math_utils():
    # Setup: create a MathUtils instance
    mu = MathUtils()
    yield mu
    # Teardown: nothing needed, but fixture structure is ready for expansion


# -------------------------
# Tests for add()
# -------------------------
def test_add_positive_numbers(math_utils):
    assert math_utils.add(5, 3) == 8

def test_add_negative_numbers(math_utils):
    assert math_utils.add(-5, -7) == -12

def test_add_with_zero(math_utils):
    assert math_utils.add(5, 0) == 5


# -------------------------
# Tests for subtract()
# -------------------------
def test_subtract_positive_numbers(math_utils):
    assert math_utils.subtract(5, 3) == 2

def test_subtract_negative_numbers(math_utils):
    assert math_utils.subtract(-5, -7) == 2

def test_subtract_with_zero(math_utils):
    assert math_utils.subtract(5, 0) == 5


# -------------------------
# Tests for multiply()
# -------------------------
def test_multiply_positive_numbers(math_utils):
    assert math_utils.multiply(5, 3) == 15

def test_multiply_negative_numbers(math_utils):
    assert math_utils.multiply(-5, 3) == -15

def test_multiply_by_zero(math_utils):
    assert math_utils.multiply(5, 0) == 0


# -------------------------
# Tests for divide()
# -------------------------
def test_divide_valid(math_utils):
    assert math_utils.divide(5, 2) == 2.5

def test_divide_negative(math_utils):
    assert math_utils.divide(-5, 2) == -2.5

def test_divide_by_zero(math_utils):
    assert math_utils.divide(10, 0) == -1.0
