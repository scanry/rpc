package com.six.dove.transport;


/**
 * @author:MG01867
 * @date: 2018年5月9日
 * @email: 359852326@qq.com
 * @version:
 * @describe 网络地址
 */
public class NetAddress {

	private String host;

	private int port;

	public NetAddress(String host, int port) {
		if (null == host) {
			throw new IllegalArgumentException("The host must be not null");
		}
		if (port <= 0) {
			throw new IllegalArgumentException(String.format("The port[%s] must greater than 0", port));
		}
		this.host = host;
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}

	@Override
	public int hashCode() {
		return host.hashCode() + port;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == this) {
			return true;
		}
		if (null == ob || !(ob instanceof NetAddress)) {
			return false;
		} else {
			NetAddress target = (NetAddress) ob;
			if (host.equals(target.getHost()) && this.port == target.port) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		return host + ":" + port;
	}
}
