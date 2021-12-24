package ma.education.tp5.rappel;

@FunctionalInterface
interface Testable{
boolean isCorrect(String email);
}
@FunctionalInterface
interface Operation{
int addition(int a,int b);
}
@FunctionalInterface
interface Logger{
void display(String log);
}
