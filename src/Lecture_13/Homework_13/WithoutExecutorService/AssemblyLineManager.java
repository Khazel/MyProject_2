package Lecture_13.Homework_13.WithoutExecutorService;

public class AssemblyLineManager {
    private int freeAssemblyLines = 3;

    public synchronized void useAssemblyLine() {
        freeAssemblyLines--;
    }

    public synchronized void releaseAssemblyLine() {
        freeAssemblyLines++;
    }

    public synchronized int getFreeAssemblyLines() {
        return freeAssemblyLines;
    }
}
