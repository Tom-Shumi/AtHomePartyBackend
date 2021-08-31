package com.tomshumi.atHomePartyBackend.filter

import com.tomshumi.atHomePartyBackend.util.RequestUtils.Companion.wrapRequest
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.util.StringUtils
import org.springframework.web.filter.GenericFilterBean
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest

@Slf4j
class LoggingFilter: GenericFilterBean() {
    companion object {
        private val log = LoggerFactory.getLogger(LoggingFilter::class.java)
    }

    override fun doFilter(request: ServletRequest, response: ServletResponse, filterChain: FilterChain) {

        request as HttpServletRequest
        val requestWrapper = wrapRequest(request)

        val queryString = requestWrapper.queryString;
        if (StringUtils.hasLength(queryString)) {
            log.info("Request: {} {}?{}", requestWrapper.method, requestWrapper.requestURI, queryString);
        } else {
            log.info("Request: {} {}", requestWrapper.method, requestWrapper.requestURI);
        }

        filterChain.doFilter(requestWrapper, response)
    }

}