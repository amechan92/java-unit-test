
@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("User should be considered an adult if age is more than 18", true, isAdult);
}
