package net.runelite.client.plugins.slayer;

import java.awt.Color;
import java.awt.image.BufferedImage;
import lombok.ToString;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.InfoBox;

@ToString
public class TargetWeaknessItemOverlay extends InfoBox
{
	private static final Color RED_BACKGROUND_COLOR = new Color(150, 0, 0, 150);

	public TargetWeaknessItemOverlay(BufferedImage image, Plugin plugin)
	{
		super(image, plugin);
		this.setPanelBackgroundColor(RED_BACKGROUND_COLOR);
	}

	@Override
	public String getText()
	{
		return null;
	}

	@Override
	public Color getTextColor()
	{
		return null;
	}
}
