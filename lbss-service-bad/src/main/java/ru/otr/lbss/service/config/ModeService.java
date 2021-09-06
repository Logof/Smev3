package ru.otr.lbss.service.config;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cxc.jex.common.application.config.PropertiesService;
import ru.otr.lbss.client.api.SmevPrimeServiceLocal;
import ru.otr.lbss.service.SmevFTPService;
import ru.otr.lbss.service.SmevMemberService;
import ru.otr.lbss.service.SmevSignService;

public class ModeService {
	private static Logger log = LoggerFactory.getLogger(ModeService.class);

	@Autowired
	private PropertiesService propertiesService;

	private SmevPrimeServiceLocal.Mode primeServiceMode;
	private SmevSignService.Mode signServiceMode;
	private SmevFTPService.Mode ftpServiceMode;
	private SmevMemberService.Mode memberServiceMode;

	private boolean antiDDOSEnable;

	@PostConstruct
	private void init() {
		log.info("init");
		try {

			primeServiceMode = SmevPrimeServiceLocal.Mode
			        .valueOf(propertiesService.getString(ServiceProperties.PrimeService_mode, SmevPrimeServiceLocal.Mode.LIVE.toString()));
			log.info("PrimeServiceMode : " + primeServiceMode.toString());

			signServiceMode = SmevSignService.Mode
			        .valueOf(propertiesService.getString(ServiceProperties.SignService_mode, SmevSignService.Mode.STUB.toString()));
			log.info("SignServiceMode : " + signServiceMode.toString());

			ftpServiceMode = SmevFTPService.Mode.valueOf(propertiesService.getString(ServiceProperties.FTPService_mode, SmevFTPService.Mode.COPY.toString()));
			log.info("FTPServiceMode : " + ftpServiceMode.toString());

			memberServiceMode = SmevMemberService.Mode
			        .valueOf(propertiesService.getString(ServiceProperties.MemberService_mode, SmevMemberService.Mode.STUB.toString()));
			log.info("MemberServiceMode : " + memberServiceMode.toString());

			antiDDOSEnable = propertiesService.getBoolean(ServiceProperties.AntiDDOS_enable, false);
			log.info("AntiDDOS : " + (antiDDOSEnable ? "ENABLE" : "DISABLE"));

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public SmevPrimeServiceLocal.Mode getPrimeServiceMode() {
		return primeServiceMode;
	}

	public SmevSignService.Mode getSignServiceMode() {
		return signServiceMode;
	}

	public SmevFTPService.Mode getFtpServiceMode() {
		return ftpServiceMode;
	}

	public SmevMemberService.Mode getMemberServiceMode() {
		return memberServiceMode;
	}

	public boolean isAntiDDOSEnable() {
		return antiDDOSEnable;
	}

}
