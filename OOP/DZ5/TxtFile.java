package OOP.DZ5;

public interface TxtFile {
        void saveToTxt(Phonebook phonebook) throws Exception;
        void loadFromTxt(Phonebook phonebook) throws Exception;
}