package Lecture_11.Homework_11;

class InvalidFileExtensionException extends RuntimeException {
    public InvalidFileExtensionException(String message) {
        super(message);
    }
}

class Student {
    private final String name;
    private String[] files;
    int score;

    Student(String name, String[] files) {
        this.name = name;
        this.files = files;
        this.score = 0;
    }

    public int checkFileExtension(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileExtensionException("File submitted is empty. You get -1 point.");
        } else if (fileName.endsWith(".java")) {
            System.out.println("You get one point for correct file extension of " + fileName);
            return 1;
        } else {
            System.out.println("You did not get extra points for incorrect file extension of " + fileName);
            return 0;
        }
    }

    public void checkFiles() {
        System.out.println("Validating " + Student.this.name);
        for (String file : files) {
            try {
                int points = checkFileExtension(file);
                score += points;
            } catch (InvalidFileExtensionException e) {
                System.err.println(e.getMessage());
                score -= 1;
            }
        }
        System.out.println(Student.this.name + " score is " + Student.this.score);
        System.out.println();
    }
}
