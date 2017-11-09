package com.nordstrom.smrt.steps;

import com.nordstrom.smrt.base.Config;
import com.nordstrom.smrt.base.EnvironmentUtils;

/**
 * Created by Kseniia_Semioshko on 11/7/2017.
 */
public class BaseSteps {

    protected Config config =
            EnvironmentUtils.getPropertiesFromConfig();

}
