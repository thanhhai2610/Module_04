package dictionary.service.impl;

import dictionary.model.DictionaryApp;
import dictionary.repository.IDictionaryRepo;
import dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService implements IDictionaryService {

    @Autowired
    IDictionaryRepo repository;

    @Override
    public String searchDictionary(String vie) {
        List<DictionaryApp> dictionaryAppList = repository.searchDictionary();

        for (DictionaryApp dictionaryApp : dictionaryAppList) {
            if (dictionaryApp.getVie().equals(vie)) {
                return dictionaryApp.getEng();
            }
        }
        return "Not Found";
    }
}
