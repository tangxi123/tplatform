package com.ttest.point;

import com.tserve.point.Audience;
import com.tserve.point.ConcerConfig;
import com.tserve.point.ConcertPerformance;
import com.tserve.point.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcerConfig.class)
public class AudienceTest {

//    @Autowired
//    Performance concertPerformance;

    @Autowired
    ConcertPerformance concertPerformance;

    @Test
    public void invokePoint(){

        concertPerformance.perform();
    }




}
