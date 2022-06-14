public class WizardsAndWarriors {
    abstract class Fighter {

        boolean isVulnerable() {
            return false;
        }

        abstract int damagePoints(Fighter fighter);

    }

    class Warrior extends Fighter {

        @Override
        public String toString() {
            return  "Fighter is a "+getClass().getName();
        }

        @Override
        int damagePoints(Fighter wizard) {
            return wizard.isVulnerable() ? 10 : 6;
        }
    }

    class Wizard extends Fighter {
        public boolean spellprepared;
        @Override
        boolean isVulnerable() {
            return spellprepared==false;
        }

        @Override
        int damagePoints(Fighter warrior) {
            return spellprepared ? 12 : 3;
        }

        void prepareSpell() {
            spellprepared = true;
        }

    }


}
