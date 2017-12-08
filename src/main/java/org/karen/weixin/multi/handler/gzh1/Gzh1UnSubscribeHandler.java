package org.karen.weixin.multi.handler.gzh1;

import org.karen.weixin.multi.config.WxConfig;
import org.karen.weixin.multi.config.WxGzh1Config;
import org.karen.weixin.multi.handler.UnsubscribeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gzh1UnSubscribeHandler extends UnsubscribeHandler {
  @Autowired
  private WxGzh1Config wxConfig;

  @Override
  protected WxConfig getWxConfig() {
    return this.wxConfig;
  }

}
