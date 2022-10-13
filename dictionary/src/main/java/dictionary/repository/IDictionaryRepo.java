package dictionary.repository;

import dictionary.model.DictionaryApp;

import java.util.List;

public interface IDictionaryRepo {
    List<DictionaryApp> searchDictionary();
}
