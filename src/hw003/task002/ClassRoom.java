package hw003.task002;

public class ClassRoom {
    Pupil pupilOne;
    Pupil pupilTwo;
    Pupil pupilThree;
    Pupil pupilFour;
    Pupil[] pupils = new Pupil[4];

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo) {
        this.pupilOne = pupilOne;
        this.pupilTwo = pupilTwo;
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
    }

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo, Pupil pupilThree) {
        this.pupilOne = pupilOne;
        this.pupilTwo = pupilTwo;
        this.pupilThree = pupilThree;
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
        pupils[2] = pupilThree;
    }

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo, Pupil pupilThree, Pupil pupilFour) {
        this.pupilOne = pupilOne;
        this.pupilTwo = pupilTwo;
        this.pupilThree = pupilThree;
        this.pupilFour = pupilFour;
        pupils[0] = pupilOne;
        pupils[1] = pupilTwo;
        pupils[2] = pupilThree;
        pupils[3] = pupilFour;
    }

    public static void showPupilMethods(ClassRoom someClassRoom) {
        for (int i = 0; i < someClassRoom.pupils.length; i++) {
            if (someClassRoom.pupils[i] != null) {
                System.out.printf("Methods of Pupil #%d:\n", i + 1);
                someClassRoom.pupils[i].study();
                someClassRoom.pupils[i].read();
                someClassRoom.pupils[i].write();
                someClassRoom.pupils[i].relax();
                System.out.println("-".repeat(40));
            }
        }
    }
}