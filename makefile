JCC = javac
JFLAGS = -g
default: Answer.class Exam.class ExamTester.class Question.class MCAnswer.class MCQuestion.class MCSAAnswer.class MCSAQuestion.class SAAnswer.class SAQuestion.class MCMAAnswer.class MCMAQuestion.class ScannerFactory.class
Answer.class: Answer.java
		$(JCC) $(JFLAGS) Answer.java
Exam.class: Exam.java
		$(JCC) $(JFLAGS) Exam.java
Question.class: Question.java
		$(JCC) $(JFLAGS) Question.java
MCAnswer.class: MCAnswer.java
		$(JCC) $(JFLAGS) MCAnswer.java
MCMAAnswer.class: MCMAAnswer.java
		$(JCC) $(JFLAGS) MCMAAnswer.java
MCMAQuestion.class: MCMAQuestion.java
		$(JCC) $(JFLAGS) MCMAQuestion.java
MCQuestion.class: MCQuestion.java
		$(JCC) $(JFLAGS) MCQuestion.java
MCSAAnswer.class: MCSAAnswer.java
		$(JCC) $(JFLAGS) MCSAAnswer.java
MCSAQuestion.class: MCSAQuestion.java
		$(JCC) $(JFLAGS) MCSAQuestion.java
SAAnswer.class: SAAnswer.java
		$(JCC) $(JFLAGS) SAAnswer.java
SAQuestion.class: SAQuestion.java
		$(JCC) $(JFLAGS) SAQuestion.java
ScannerFactory.class: ScannerFactory.java
		$(JCC) $(JFLAGS) ScannerFactory.java
ExamTester.class :  Answer.class Exam.class ExamTester.class Question.class MCAnswer.class MCQuestion.class MCSAAnswer.class MCSAQuestion.class SAAnswer.class SAQuestion.class MCMAAnswer.class MCMAQuestion.class ScannerFactory.class
		$(JCC) $(JFLAGS) ExamTester.java
clean:
		rm *.class
