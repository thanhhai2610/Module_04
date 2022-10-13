package dictionary.repository.impl;

import dictionary.model.DictionaryApp;
import dictionary.repository.IDictionaryRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DictionaryRepo implements IDictionaryRepo {
    private static List<DictionaryApp> repositories = new ArrayList<>();

    static {
        repositories.add(new DictionaryApp("hai", "ngu"));
        repositories.add(new DictionaryApp("son", "thieu nang"));
        repositories.add(new DictionaryApp("map", "dot"));
        repositories.add(new DictionaryApp("giang", "dan"));
        repositories.add(new DictionaryApp("uyen", "stupid"));
    }

    @Override
    public List<DictionaryApp> searchDictionary() {
        return repositories;
    }


}
