
package com.hdstcloud.oauth2.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hdstcloud.oauth2.mapper.PoUserBaseMapper;
import com.hdstcloud.oauth2.po.PoUser;
import org.springframework.stereotype.Service;

/**
 * @author PC
 */
@Service
public class PoUserServiceImpl
    extends ServiceImpl<PoUserBaseMapper, PoUser>
    implements PoUserService
{


}
