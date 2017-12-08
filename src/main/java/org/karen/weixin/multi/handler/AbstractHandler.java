package org.karen.weixin.multi.handler;

import org.karen.weixin.multi.config.WxConfig;
import com.google.gson.Gson;
import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Binary Wang
 */
public abstract class AbstractHandler implements WxMpMessageHandler {

  protected final Gson gson = new Gson();
  protected Logger logger = LoggerFactory.getLogger(getClass());

  protected abstract WxConfig getWxConfig();

}
