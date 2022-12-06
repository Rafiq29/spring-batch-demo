package com.herb.springbatchdemo.config;

import com.herb.springbatchdemo.model.Tutorial;
import org.springframework.batch.item.ItemProcessor;

public class TutorialItemProcessor implements ItemProcessor<Tutorial, Tutorial> {
    @Override
    public Tutorial process(Tutorial item) throws Exception {
        return item;
    }
}
