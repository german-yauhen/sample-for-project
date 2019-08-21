package com.german.yauhen.service.impl;

import com.german.yauhen.service.api.GeneralService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GeneralServiceImpl implements GeneralService {

  @Override
  public void execute(List<String> cmdArgs) {
    log.info("Start program with command line arguments " + cmdArgs);
    log.info("End program");
  }

}
