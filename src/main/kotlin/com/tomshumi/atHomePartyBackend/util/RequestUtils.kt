package com.tomshumi.atHomePartyBackend.util

import com.tomshumi.atHomePartyBackend.filter.LoggingFilter
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.util.ContentCachingRequestWrapper
import javax.servlet.http.HttpServletRequest

@Component
class RequestUtils {
    companion object {
        fun wrapRequest(request: HttpServletRequest): ContentCachingRequestWrapper {
            return if (request is ContentCachingRequestWrapper) {
                request
            } else {
                ContentCachingRequestWrapper(request)
            }
        }
    }
}