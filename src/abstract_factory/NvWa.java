package abstract_factory;

public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        System.out.println("--->黄男");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getGender();

        System.out.println("--->黄女");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getGender();

        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();

        System.out.println("--->白男");
        maleWhiteHuman.getColor();
        maleWhiteHuman.talk();
        maleWhiteHuman.getGender();

        System.out.println("--->白女");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getGender();

        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();

        System.out.println("--->黑男");
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getGender();

        System.out.println("--->黑女");
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getGender();
    }
}
