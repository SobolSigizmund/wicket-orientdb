package ru.ydn.wicket.wicketorientdb.security;

import org.apache.wicket.authorization.strategies.CompoundAuthorizationStrategy;
import org.apache.wicket.authroles.authorization.strategies.role.IRoleCheckingStrategy;
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AnnotationsRoleAuthorizationStrategy;

public class WicketOrientDbAuthorizationStrategy extends
		CompoundAuthorizationStrategy {
	
	public WicketOrientDbAuthorizationStrategy(final IRoleCheckingStrategy roleCheckingStrategy)
	{
		add(new AnnotationsRoleAuthorizationStrategy(roleCheckingStrategy));
		add(new OrientResourceAuthorizationStrategy());
	}
}
